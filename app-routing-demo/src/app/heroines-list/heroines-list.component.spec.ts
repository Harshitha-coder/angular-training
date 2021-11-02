import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HeroinesListComponent } from './heroines-list.component';

describe('HeroinesListComponent', () => {
  let component: HeroinesListComponent;
  let fixture: ComponentFixture<HeroinesListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ HeroinesListComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(HeroinesListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
