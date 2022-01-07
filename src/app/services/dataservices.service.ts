import { HttpClient } from '@angular/common/http';
import { ThrowStmt } from '@angular/compiler';
import { Injectable } from '@angular/core';


@Injectable({
  providedIn: 'root'
})
export class DataservicesService {

  message! : string;
  url = 'http://localhost:8080/users';
  ticket_url = 'http://localhost:8080/tickets';
  constructor(private http:HttpClient) { }
  getMessage()
  {
    return this.message;
  }


  saveUser(data:any)
  {
    return this.http.post(this.url,data)
  }

  getUser(get_data:any)
  {
    return this.http.get(this.url,get_data)
  }

  saveTicket(save_ticket:any)
  {
    console.log(save_ticket);
    return this.http.post(this.ticket_url,save_ticket);
  }

  getTicket(get_ticket:any)
  {
    return this.http.get(this.ticket_url,get_ticket) 
  }

  updateTicket(get_ticket:any)
  {
    return this.http.put(this.ticket_url,get_ticket) 
  }

  deleteTicket(get_ticket:any)
  {
    return this.http.delete(this.ticket_url,get_ticket) 
  }
}
