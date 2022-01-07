import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { ServicesComponent } from '../services/services.component';
import { DataservicesService } from '../services/dataservices.service';
import { FormGroup,FormControl,FormControlName,Validators } from '@angular/forms'

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  registerForm = new FormGroup({
    username : new FormControl('',[Validators.required,Validators.min(3),]),
    gender : new FormControl('',[Validators.required,]),
    mobile : new FormControl('',[Validators.required]),
    age : new FormControl('',[Validators.required,Validators.pattern('[0-9]{0,2}')]),
    email : new FormControl('',[Validators.required,Validators.email]),
    password : new FormControl('',[Validators.required,Validators.pattern('/^(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]{6,16}$/')]),

  })
  users : any;
  constructor(private userData:DataservicesService) {
   
   }

  ngOnInit(){
    // let resp = this.http.get("http://localhost:8080/users");
    // resp.subscribe((data)=>this.users= data);
  }

  getUserFormData(data:any)
  {
    console.warn(data);
    this.userData.saveUser(data).subscribe((data)=>{
      console.warn(data);
    })
    
  }

  get username_valid()
  {
    return this.registerForm.get('username');
  }

  get gender_valid()
  {
    return this.registerForm.get('gender');
  }

  get mobile_valid()
  {
    return this.registerForm.get('mobile');
  }

  get age_valid()
  {
    return this.registerForm.get('age');
  }

  get email_valid()
  {
    return this.registerForm.get('email');
  }

  get password_valid()
  {
    return this.registerForm.get('password');
  }
}

