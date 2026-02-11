const women = [
  { name: "Lakshmi", education: "Graduate", score: 75 },
  { name: "Asha", education: "Postgraduate", score: 85 },
  { name: "Rekha", education: "Diploma", score: 65 },
  { name: "Sunita", education: "School", score: 55 }
];

// Sort by score (descending)
women.sort((a, b) => b.score - a.score);

// Display leaderboard
console.log("🏆 Women Empowerment Leaderboard\n");

women.forEach((w, index) => {
  console.log(
    `${index + 1}. ${w.name} | Education: ${w.education} | Credit Score: ${w.score}`
  );
});
