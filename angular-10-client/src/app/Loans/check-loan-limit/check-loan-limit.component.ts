import { Component, OnInit } from '@angular/core';
import {HttpClient} from "@angular/common/http";
export class allLoanData {
  constructor(
    public id: number,
    public firstname: string,
    public lastname: string,
    public idnumber: string,
    public email: string,
  ) {
  }
}

@Component({
  selector: 'app-check-loan-limit',
  templateUrl: './check-loan-limit.component.html',
  styleUrls: ['./check-loan-limit.component.css']
})
export class CheckLoanLimitComponent implements OnInit {

  allLoanData : allLoanData[];

  constructor(
    private httpClient : HttpClient
  ) { }

  ngOnInit(): void {
    this.getAllLoanData();
  }
  getAllLoanData(){
    this.httpClient.get<any>('http://localhost:8080/api/auth/getAllLoans').subscribe(
      response => {
        // console.log(response);
        this.allLoanData = response;
      }
    );
  }

}
