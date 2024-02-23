import http from "k6/http";
import { check } from "k6";
import { Trend } from "k6/metrics";
import { group, sleep } from "k6";

//const contactsLatency = new Trend("contact_duration");

export function pet(baseUrl) {
  group('pet flow', function () {
    const url = "/pet";
    const payload = JSON.stringify({
        id: 10,
        name: "doggie",
        category: {
            id: 1,
            name: "Dogs",
        },
        photoUrls: [
            "string",
        ],
        tags: [
            {
                id: 0,
                name: "string",
            },
        ],
        status: "available",
    });
      const params = {
        headers: {
          "Content-Type": "application/json",
        },
      };

      const res = http.post(baseUrl+url, payload, params);

      check(res, {
        "response code was 200": (res) => res.status == 200,
      });
  });
}