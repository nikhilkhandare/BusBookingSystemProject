import { Component, OnInit } from '@angular/core';
import { FormGroup,FormControl,FormControlName,Validators } from '@angular/forms'
@Component({
  selector: 'app-payment',
  templateUrl: './payment.component.html',
  styleUrls: ['./payment.component.css']
})
export class PaymentComponent implements OnInit {

  constructor() { }
  PaymentForm = new FormGroup({
    username : new FormControl('',[Validators.required,]),
    cardNumber : new FormControl('',[Validators.required,Validators.pattern('^(?:4[0-9]{12}(?:[0-9]{3})?|[25][1-7][0-9]{14}|6(?:011|5[0-9][0-9])[0-9]{12}|3[47][0-9]{13}|3(?:0[0-5]|[68][0-9])[0-9]{11}|(?:2131|1800|35\d{3})\d{11})$')]),
    month:new FormControl('',[Validators.required,Validators.pattern('^(0?[1-9]|1[012])$')]),
    year : new FormControl('',[Validators.required,Validators.pattern('^(202)[2-9]{1}$')]),
    cvv: new FormControl('',[Validators.required,Validators.pattern('^([0-9]{3}$)')])
  })
  ngOnInit(): void {
  }
  getUserFormData(data: any)
  {

  }

  get username_valid()
  {
    return this.PaymentForm.get('username');
  }

  get cardNumber_valid()
  {
    return this.PaymentForm.get('cardNumber');
  }

  get month_valid()
  {
    return this.PaymentForm.get('month');
  }

  get year_valid()
  {
    return this.PaymentForm.get('year');
  }

  get cvv_valid()
  {
    return this.PaymentForm.get('cvv');
  }

}
