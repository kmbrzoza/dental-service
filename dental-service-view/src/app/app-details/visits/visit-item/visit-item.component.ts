import { Component, EventEmitter, Input, Output } from '@angular/core';
import * as moment from 'moment';
import { Role } from 'src/app/core/models/role.model';
import { Visit } from 'src/app/core/models/visits.model';

@Component({
    selector: 'ds-visit-item',
    templateUrl: './visit-item.component.html',
    styleUrls: ['./visit-item.component.scss']
})
export class VisitItemComponent {
    @Input() visit: Visit;
    @Input() reservation: boolean = false;

    @Output() visitConfirmed = new EventEmitter<number>();

    now = moment();
    role = Role;
    displayServices = false;
    buttonDisabled = false;

    confirmVisit(): void {
        this.visitConfirmed.next(this.visit.visit.id);
        this.buttonDisabled = true;
    }
}
