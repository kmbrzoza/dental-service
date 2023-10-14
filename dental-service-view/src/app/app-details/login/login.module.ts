import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { ReactiveFormsModule } from '@angular/forms';
import { MaterialModule } from 'src/app/material.module';
import { ErrorMessageModule } from 'src/app/shared/components/error-message/error-message.module';
import { SpinnerButtonModule } from 'src/app/shared/components/spinner-button/spinner-button.module';
import { SpinnerModule } from 'src/app/shared/components/spinner/spinner.module';

import { LoginRoutingModule } from './login-routing.module';
import { LoginComponent } from './login.component';

@NgModule({
    declarations: [
        LoginComponent
    ],
    imports: [
        CommonModule,
        LoginRoutingModule,
        MaterialModule,
        SpinnerModule,
        SpinnerButtonModule,
        ErrorMessageModule,
        ReactiveFormsModule
    ]
})
export class LoginModule { }
