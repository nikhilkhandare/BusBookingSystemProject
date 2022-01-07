import { DataservicesService } from './../services/dataservices.service';
import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';


@Component({
  selector: 'app-seat-booking',
  templateUrl: './seat-booking.component.html',
  styleUrls: ['./seat-booking.component.css']
})
export class SeatBookingComponent implements OnInit {
  price! : string
  constructor(private userData:DataservicesService) { }

  ngOnInit(): void {

  }
  bookedticketForm= new FormGroup({
    seats:new FormControl('',[Validators.required]),
  })

  getBookedTicketFormData(data:any)
  {
   
    console.warn(data.seats)
    console.warn(this.price = this.userData.getMessage())
    console.log("hii")
    console.log(data.seats);

  }
  
}
