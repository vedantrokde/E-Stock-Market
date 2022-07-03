import { NgModule } from "@angular/core";
import { BrowserModule } from "@angular/platform-browser";
import { FormsModule } from "@angular/forms";
import { AppComponent } from "./app.component";
import { HttpClientModule, HttpClientXsrfModule } from "@angular/common/http";
import { AgGridModule } from "ag-grid-angular";
import { NgbModule } from "@ng-bootstrap/ng-bootstrap";

@NgModule({
	declarations: [AppComponent],
	imports: [
		BrowserModule,
		FormsModule,
		AgGridModule,
		NgbModule,
		HttpClientModule,
		HttpClientXsrfModule,
	],
	providers: [],
	bootstrap: [AppComponent],
})
export class AppModule {}
