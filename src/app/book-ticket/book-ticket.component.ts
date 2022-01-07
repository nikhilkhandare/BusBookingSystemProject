import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-book-ticket',
  templateUrl: './book-ticket.component.html',
  styleUrls: ['./book-ticket.component.css']
})
export class BookTicketComponent implements OnInit {

  constructor(private http:HttpClient) { }
  ticket : any
  ngOnInit(): void {
    let resp = this.http.get("http://localhost:8080/tickets");
    resp.subscribe((data)=>this.ticket=data);
  }

}
