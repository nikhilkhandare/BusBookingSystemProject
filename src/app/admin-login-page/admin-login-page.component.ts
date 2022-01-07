import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { DataservicesService } from '../services/dataservices.service';

@Component({
  selector: 'app-admin-login-page',
  templateUrl: './admin-login-page.component.html',
  styleUrls: ['./admin-login-page.component.css']
})
export class AdminLoginPageComponent implements OnInit {

  constructor(private formBuilder : FormBuilder,private http: HttpClient,private userData:DataservicesService, private router : Router) { }
  a:any
  ngOnInit(): void {
  }
  AdminLoginPageForm= new FormGroup({
    username:new FormControl('',[Validators.required]),
    password:new FormControl('',[Validators.required,]),
  })
  loginAdmin()
  {
    
    this.http.get<any>("http://localhost:8080/users").subscribe(res=>{
      const user = res.find((a:any)=>{
        console.log(a.username);
        return a.username === "admin" && a.password === "Admin@1230@"
      });
      if(user)
      {
        alert('login Sucess');
        this.AdminLoginPageForm.reset();
        this.router.navigate(['addticket'])
      }
      else{
        alert('login error');
      }
     
    })
  }
  get username_valid(){
    return this.AdminLoginPageForm.get("username")
  }

  get password_valid()
  {
    return this.AdminLoginPageForm.get('password');
  }

}
