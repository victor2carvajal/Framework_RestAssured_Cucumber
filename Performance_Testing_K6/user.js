import http from "k6/http";
import { check } from "k6";
import { Trend } from "k6/metrics";
import { group, sleep } from "k6";

//const contactsLatency = new Trend("contact_duration");

export function user(baseUrl) {
  group('user flow', function () {
    const url = "/user/theUser";
      const params = {
        headers: {
          "accept": "application/xml",
        },
      };
      const res = http.get(baseUrl+url, params);
      check(res, {
        "response code was 200": (res) => res.status == 200,
      });
  });
}