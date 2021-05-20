import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CheckLoanLimitComponent } from './check-loan-limit.component';

describe('CheckLoanLimitComponent', () => {
  let component: CheckLoanLimitComponent;
  let fixture: ComponentFixture<CheckLoanLimitComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CheckLoanLimitComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CheckLoanLimitComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
