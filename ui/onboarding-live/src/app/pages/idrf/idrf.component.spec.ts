import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { IdrfComponent } from './idrf.component';

describe('IdrfComponent', () => {
  let component: IdrfComponent;
  let fixture: ComponentFixture<IdrfComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ IdrfComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(IdrfComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
