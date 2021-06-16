var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var b = "Hello world";
console.log(b);
var employee = {
    id: 1,
    name: "ALbert",
    salary: 30000,
    calculatepf: function () {
        return 0.12 * employee.salary;
    }
};
console.log(employee.calculatepf());
var Bank = /** @class */ (function () {
    function Bank(id, name, salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    Bank.prototype.getloanapproved = function () {
        if (this.salary < 5000) {
            return false;
        }
        else {
            return true;
        }
    };
    return Bank;
}());
var bank = new Bank(1, "ABC", 30000);
console.log(bank.getloanapproved());
var Department = /** @class */ (function () {
    function Department(id) {
        this.id = id;
    }
    return Department;
}());
var CSE = /** @class */ (function (_super) {
    __extends(CSE, _super);
    function CSE(name, roll, id) {
        var _this = _super.call(this, id) || this;
        _this.name = name;
        _this.roll = roll;
        return _this;
    }
    return CSE;
}(Department));
var student = new CSE("scott", 1, 101);
console.log(student.id);
