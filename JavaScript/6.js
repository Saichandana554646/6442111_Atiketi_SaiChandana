let allEvents = [
  { name: "Yoga", type: "health" },
  { name: "Rock Concert", type: "music" }
];
allEvents.push({ name: "Jazz", type: "music" });
let musicEvents = allEvents.filter(e => e.type === "music");
let cards = allEvents.map(e => `Event: ${e.name.toUpperCase()}`);
console.log(cards);
