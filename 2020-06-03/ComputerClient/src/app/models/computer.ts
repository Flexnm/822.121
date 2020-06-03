export class Computer {
    constructor(
        private _id: number, 
        private _model:string, 
        private _ram:number,
        private _price:number){}

    
    get id() : number {
        return this._id;
    }

    get model() : string{
        return this._model;
    }
    
    get ram() : number {
        return this._ram;
    }

    get price() : number {
        return this._price;
    }
    
    // public set set_ram(v : number) {
    //     this._ram = v;
    // }

    // public set set_price(v : number) {
    //     this._price = v;
    // }
    
    
}
