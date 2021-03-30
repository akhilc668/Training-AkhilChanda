import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DemotesterComponent } from './demotester.component';

describe('DemotesterComponent', () => {
  let component: DemotesterComponent;
  let fixture: ComponentFixture<DemotesterComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DemotesterComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DemotesterComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
