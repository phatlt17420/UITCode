const car = {
  name: "Phat",
  lastName: "Le Tan",
  age: 33,
  eyeColor: "black",
  fullName: function () {
    return this.lastName + this.name;
  },
};
document.getElementById("demo").innerHTML =
  car.fullName() + " " + car.age + car.eyeColor;
