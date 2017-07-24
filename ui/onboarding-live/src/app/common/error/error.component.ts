import { Component, OnInit } from '@angular/core';
import {ActivatedRoute} from '@angular/router';

@Component({
  selector: 'app-error',
  templateUrl: './error.component.html',
  styleUrls: ['./error.component.css']
})
export class ErrorComponent implements OnInit {
	msg: String;
  constructor(route: ActivatedRoute) {
    this.msg = route.snapshot.data.msg ||  'Not Sure';
	}

  ngOnInit() {
  }

}
