import {Component, OnInit} from "@angular/core";
import {UserService} from "../../_services/user.service";
import {AuthService} from "../../_services/auth.service";

@Component({
  selector: 'app-board-admin',
  templateUrl: './apply-loans.component.html',
  styleUrls: ['./apply-loans.component.css']
})
export class ApplyLoansComponent implements OnInit {
  form: any = {};
  isSuccessful = false;
  isSignUpFailed = false;
  errorMessage = '';
  content: string;

  constructor(private authService: AuthService,private userService: UserService) { }

  onSubmit(): void {
    this.authService.register(this.form).subscribe(
      data => {
        console.log(data);
        this.isSuccessful = true;
        this.isSignUpFailed = false;
      },
      err => {
        this.errorMessage = err.error.message;
        this.isSignUpFailed = true;
      }
    );
  }
  ngOnInit(): void {
    this.userService.getUserBoard().subscribe(
      data => {
        this.content = data;
      },
      err => {
        this.content = JSON.parse(err.error).message;
      }
    );
  }

}
