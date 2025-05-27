function Event(name, seats) {
  this.name = name;
  this.seats = seats;
}
Event.prototype.checkAvailability = function () {
  return this.seats > 0;
};
const musicEvent = new Event("Jazz Night", 20);
console.log(Object.entries(musicEvent)); // [['name', 'Jazz Night'], ['seats', 20]]
console.log(musicEvent.checkAvailability());
