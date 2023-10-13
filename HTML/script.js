let currentNumber = '';
let operator = '';
let result = 0;

function appendNumber(number) {
  currentNumber += number;
  updateResult();
}

function appendOperator(op) {
  operator =