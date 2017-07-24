import { Component, OnInit } from '@angular/core';
import {ActivatedRoute} from '@angular/router';

@Component({
  selector: 'app-add-candidate',
  templateUrl: './add-candidate.component.html',
  styleUrls: ['./add-candidate.component.css']
})
export class AddCandidateComponent implements OnInit {

   candidateId: string;
 
  constructor(route: ActivatedRoute) { // 2
    this.candidateId = route.snapshot.params['id']; // 3
  }
  ngOnInit() {
  }

}
