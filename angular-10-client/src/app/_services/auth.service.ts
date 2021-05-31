import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

const AUTH_API = 'http://localhost:8080/api/auth/';
/*
* sending signin/signup requests
* */
const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};
//"/api/auth/applied_loans"

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor(private http: HttpClient) { }

  login(credentials): Observable<any> {
    return this.http.post(AUTH_API + 'signin', {
      username: credentials.username,
      password: credentials.password
    }, httpOptions);
  }

  register(user): Observable<any> {
    return this.http.post(AUTH_API + 'signup', {
      username: user.username,
      email: user.email,
      password: user.password
    }, httpOptions);
  }

  applyLoans(loanee): Observable<any> {
    return this.http.post(AUTH_API + 'saveAll', {
      firstname: loanee.firstname,
      lastname: loanee.lastname,
      idnumber: loanee.idnumber,
      email: loanee.email,
    }, httpOptions);
  }
}
