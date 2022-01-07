import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { Router, RouterModule, Routes } from '@angular/router';
import { HttpClientModule} from '@angular/common/http'; 
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { FormsModule, ReactiveFormsModule} from '@angular/forms';
import { ServicesComponent } from './services/services.component';
import { BookTicketComponent } from './book-ticket/book-ticket.component';
import { LoginPageComponent } from './login-page/login-page.component';
import { PaymentComponent } from './payment/payment.component';
import { HomepageComponent } from './homepage/homepage.component';
import { AdminTicketComponent } from './admin-ticket/admin-ticket.component';
import { AdminLoginPageComponent } from './admin-login-page/admin-login-page.component';
import { SeatBookingComponent } from './seat-booking/seat-booking.component';

const routes: Routes = [
  {path:'register',component:LoginComponent},
  {path: 'bookticket',component:BookTicketComponent, },
  {path: 'homepage',component:HomepageComponent,},
  {path: 'login',component:LoginPageComponent,},
  {path: 'payment',component:PaymentComponent,},
  {path: 'addticket',component:AdminTicketComponent,},
  {path: 'adminlogin',component:AdminLoginPageComponent},
  {path: 'seatbooking',component:SeatBookingComponent}
];

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    ServicesComponent,
    BookTicketComponent,
    LoginPageComponent,
    PaymentComponent,
    HomepageComponent,
    AdminTicketComponent,
    AdminLoginPageComponent,
    SeatBookingComponent,
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(routes),
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
