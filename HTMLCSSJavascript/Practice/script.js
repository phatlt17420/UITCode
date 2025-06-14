function Person(first, last, age, eye) {
  this.firstName = first;
  this.lastName = last;
  this.age = age;
  this.eyeColor = eye;
}
const myFather = new Person("John", "Doe", 50, "Blue");
const myMother = new Person("Sally", "Rally", 48, "Green");
Person.prototype.name = function () {};
document.getElementById("demo").innerHTML =
  "My Father is " +
  myFather.age +
  ". My Mother is " +
  myMother.age +
  " ." +
  myFather.nationality;
