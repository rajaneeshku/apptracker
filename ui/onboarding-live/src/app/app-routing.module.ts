import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';
import { AddCandidateComponent } from './pages/add-candidate/add-candidate.component';
import { DashboardComponent } from './pages/dashboard/dashboard.component';
import { CandidateDetailsComponent } from './pages/candidate-details/candidate-details.component';
import { IdrfComponent } from './pages/idrf/idrf.component';
import { SettingsComponent } from './pages/settings/settings.component';
import { ErrorComponent } from './common/error/error.component';

const appRoutes: Routes = [
	{
		path: 'add-candidate',
		component: AddCandidateComponent
	}, {
		path: 'dashboard',
		component: DashboardComponent
	}, {
		path: 'candidate-details/:id',
		component: CandidateDetailsComponent
	}, {
		path: 'candidate-details',
		pathMatch: 'full',
		component: ErrorComponent,
		data: { msg: 'Missing Mandatory info to display Candidate Details' }

	}, {
		path: 'idrf/:id',
		component: IdrfComponent
	}, {
		path: 'idrf',
		pathMatch: 'full',
		component: ErrorComponent,
		data: { msg: 'Missing Mandatory info to Display IDRF Form' }
	}, {
		path: 'settings',
		component: SettingsComponent
	}, {
		path: '',
		redirectTo: '/dashboard',
		pathMatch: 'full'
	}
	// { path: '**', component: PageNotFoundComponent }
];


@NgModule({
	imports: [
		CommonModule,
		RouterModule.forRoot(
			appRoutes,
			{ enableTracing: true } // <-- debugging purposes only
		),
	],
	declarations: []
})
export class AppRoutingModule { }
