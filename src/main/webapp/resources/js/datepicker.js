function dateTemplateFunc(date) {
    alert('never called');
    return '<span style="background-color:' + ((date.day < 21 && date.day > 10) ? '#81C784' : 'inherit') + ';border-radius:50%;padding: .25em;width: 1.75em; height:1.75em; display:block;">' + date.day + '</span>';
}