import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { MaterialModule } from 'src/app/material.module';
import { AvatarModule } from 'src/app/shared/components/avatar/avatar.module';
import { SpinnerButtonModule } from 'src/app/shared/components/spinner-button/spinner-button.module';
import { SpinnerModule } from 'src/app/shared/components/spinner/spinner.module';
import { PipesModule } from 'src/app/shared/pipes/pipes.module';

import { VisitItemComponent } from './visit-item/visit-item.component';
import { VisitListComponent } from './visit-list/visit-list.component';
import { VisitsRoutingModule } from './visits-routing.module';

@NgModule({
    declarations: [
        VisitListComponent,
        VisitItemComponent
    ],
    imports: [
        CommonModule,
        VisitsRoutingModule,
        MaterialModule,
        SpinnerModule,
        AvatarModule,
        SpinnerButtonModule,
        PipesModule
    ]
})
export class VisitsModule { }
