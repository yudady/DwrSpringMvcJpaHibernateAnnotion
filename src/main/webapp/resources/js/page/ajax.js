$(function() {
	
	$("#addBtn").click(function(){
		$.log(" addBtn click");
		add();
	});
	$("#queryPersionById").click(function(){
		$.log(" queryPersionById click");
		var url = "person/" + $("#persionId").val() ;
		$.log(" url = " + url);
		$.ajax({
			url : url,
			dataType : "html",
			data : {},
			success : function(data) {
				$.log(data);
				$("#queryPersion").text(data);
			}
		});
	});
	$("#addPerson").click(function(){
		$.log(" addPerson click");
		var url = "add/" ;
		var personName = $("#personName").val() ;
		$.ajax({
			url : url,
			dataType : "html",
			type: "POST",
			data : {
				"personName" : personName
			},
			success : function(data) {
				$.log(data);
				$("#addPersonValue").text(data);
			}
		});
	});
	
	
});

// Retrieves the matching value
// Delegates to the dwrService
function add() {
	// Retrieve value of text inputs
	var operand1 = dwr.util.getValue("inputNumber1");
	var operand2 = dwr.util.getValue("inputNumber2");

	// Pass two numbers, a callback function, and error function
	dwrService.add(operand1, operand2, {
		callback : handleAddSuccess,
		errorHandler : handleAddError
	});
}

// data contains the returned value
function handleAddSuccess(data) {
	// Assigns data to result id
	dwr.util.setValue("sum", data);
}

function handleAddError() {
	// Show a popup message
	alert("We can't add those values!");
}