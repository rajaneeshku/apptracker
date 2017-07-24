import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.less']
})
export class MenuComponent implements OnInit {
  appName = 'Onboarding Live'
   displayChildMenuFlg = false;   // store state
    toggleState() { // click handler
        this.displayChildMenuFlg =  !this.displayChildMenuFlg;
    }
    collapseMenu()  {
      this.displayChildMenuFlg = false;
    } 
  constructor() { }

  ngOnInit() {
  }

}
