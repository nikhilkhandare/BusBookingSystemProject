import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { DataservicesService } from '../services/dataservices.service';

@Component({
  selector: 'app-admin-ticket',
  templateUrl: './admin-ticket.component.html',
  styleUrls: ['./admin-ticket.component.css']
})
export class AdminTicketComponent implements OnInit {
  addTicketForm = new FormGroup({
    bus_name:new FormControl('',[Validators.required,]),
    bus_no:new FormControl('',[Validators.required,]),
    date:new FormControl('',[Validators.required,]),
    time:new FormControl('',[Validators.required,]),
    source:new FormControl('',[Validators.required,]),
    destination:new FormControl('',[Validators.required,]),
    remaining_seats:new FormControl('',[Validators.required,]),
    price:new FormControl('',[Validators.required,]),
  })

  constructor(private userData:DataservicesService) { }

  ngOnInit(): void {
  }
  getTicketFormData(data:any)
  {
    console.log(data.source);
    // console.log("Hello "+data);
    this.userData.saveTicket(data).subscribe((data)=>{
      console.warn(data);
    }) 
  
  }
  updateTicketFormData(data:any)
  {
    this.userData.updateTicket(data).subscribe((data)=>{
      
    })
  }
  deleteTicketFormData(data:any)
  {

  }
  get busname_valid()
  {
    return this.addTicketForm.get('busname');
  }
  get busnumber_valid()
  {
    return this.addTicketForm.get('busNumber');
  }

  get date_valid()
  {
    return this.addTicketForm.get('date');
  }

  get time_valid()
  {
    return this.addTicketForm.get('time');
  }

  get source_valid()
  {
    return this.addTicketForm.get('source');
  }

  get destination_valid()
  {
    return this.addTicketForm.get('destination');
  }

  get rem_seats_valid()
  {
    return this.addTicketForm.get('remainingseats');
  }

  get price_valid()
  {
    return this.addTicketForm.get('price');
  }


}
