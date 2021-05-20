import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ApplyLoansComponent } from './apply-loans.component';

describe('ApplyLoansComponent', () => {
  let component: ApplyLoansComponent;
  let fixture: ComponentFixture<ApplyLoansComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ApplyLoansComponent ]
    })
      .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ApplyLoansComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
