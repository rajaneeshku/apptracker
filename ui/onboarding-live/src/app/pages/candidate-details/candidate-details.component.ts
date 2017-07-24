import { Component, OnInit } from '@angular/core';
import {ActivatedRoute} from '@angular/router';

@Component({
  selector: 'app-candidate-details',
  templateUrl: './candidate-details.component.html',
  styleUrls: ['./candidate-details.component.css']
})
export class CandidateDetailsComponent implements OnInit {

   candidateId: string;
 
  constructor(route: ActivatedRoute) { // 2
    this.candidateId = route.snapshot.params['id']; // 3
  }
  ngOnInit() {
  }


}
