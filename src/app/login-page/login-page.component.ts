import { Router, RouterModule } from '@angular/router';
import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import{ FormGroup, FormControl, Validators, FormBuilder} from '@angular/forms';
import { DataservicesService } from '../services/dataservices.service';

@Component({
  selector: 'app-login-page',
  templateUrl:'./login-page.component.html',
  styleUrls: ['./login-page.component.css']
})

export class LoginPageComponent implements OnInit {

  constructor(private formBuilder : FormBuilder,private http: HttpClient,private userData:DataservicesService, private router : Router) { }
  login_users :any
  ngOnInit(): void {
   
  }

  LoginPageForm= new FormGroup({
    username:new FormControl('',[Validators.required]),
    password:new FormControl('',[Validators.required,]),
  })
  
  loginUser(){
    this.http.get<any>("http://localhost:8080/users").subscribe(res=>{
      const user = res.find((a:any)=>{
        console.log(a.username);
        return a.username === this.LoginPageForm.value.username && a.password === this.LoginPageForm.value.password 
      });
      if(user)
      {
        alert('login Sucess');
        this.LoginPageForm.reset();
        this.router.navigate(['homepage'])
      }
      else{
        alert('login error');
      }
     
    })
  }
  getUserLoginData(data:any)
  {
    
  }
  get username_valid(){
    return this.LoginPageForm.get("username")
  }

  get password_valid()
  {
    return this.LoginPageForm.get('password');
  }

}
