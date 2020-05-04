export class Person {

    private name: string;
    private age: number;
    private isHungry: boolean;
    private toppings: ToppingEnum[];

    constructor(name: string, age: number, isHungry: boolean){
        this.name = name;
        this.age = age;
        this.isHungry = isHungry;
    }

    public getName():string{
        return this.name;
    }

    public setName(name:string){
        this.name = name;
    }


}

enum ToppingEnum{
    shrooms, olives, bacon
}
