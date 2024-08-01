const { defineConfig } = require("cypress");
const BASE_URL = "http://localhost:8080/primefaces-test/"

module.exports = defineConfig({
  e2e: {
    setupNodeEvents(on, config) {
      
    },

    baseUrl: BASE_URL
  },
});