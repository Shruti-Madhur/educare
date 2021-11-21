export class Batch{
    id: number;
    name: string;
    year: number;
    admissionYear: number;

    constructor(
        id: number,
        name: string,
        year: number,
        admissionYear: number
    ){
        this.id = id;
        this.name = name;
        this.year = year;
        this.admissionYear = admissionYear;
    }
}