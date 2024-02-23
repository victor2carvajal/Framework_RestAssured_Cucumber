import { pet } from "./pet.js";
import { user } from "./user.js";

const baseUrl = "http://localhost:8080/api/v3";

export default function () {
  //pet(baseUrl);
  user(baseUrl);
}

export const options = {

  thresholds: {
    http_req_failed: [{ threshold: "rate<0.05", abortOnFail: true }],
    http_req_duration: ['p(99)<1000'],
  },
  scenarios: {
    average_load: {
      executor: "ramping-vus",
      stages: [
        { duration: '10s', target: 20 },
        { duration: '40s', target: 20 },
        { duration: '50s', target: 40 },
        { duration: '50s', target: 60 },
        { duration: '50s', target: 80 },
        { duration: '50s', target: 120 },
        { duration: '50s', target: 140 },
      ],
    },
  }
};
