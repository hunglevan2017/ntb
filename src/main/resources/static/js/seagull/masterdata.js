
var page_context;
var columnDefs_masterdata = [
						{"title": "STT","targets": 0},
				  		{ "targets": 1,"visible": false,"searchable": false},
					    {"title": "LANGUAGE VN","targets": 2,"width":"20%"},
					    {"title": "LANGUAGE EN","targets": 3,"width":"20%"},
					    {"title": "SORT","targets": 4},
					    {"title": "ACTIVE","targets": 5, 
					    	"render": function (data, type, row, meta) {
					    
		                	   return data==1 ? 'ACTIVE':'STOP';           
		                   }
					    },
					    {"title": "CODE","targets": 6,"visible": false,"searchable": false},
					    {"title": "DEPENDENT CATEGORY","targets": 7 },
				  {
					  "title": "",
					  "targets": 8,
	                  
	                  "render": function (data, type, row, meta) {
	                	   return '<button type="button" class="btn btn-primary btn-xs masterdata-edit" data-id=' + row['ID'] + ' > <i class="fa fa-edit"> </i> Edit</button>';           
	                   }
	         
				  },
				  {
					  "title": "",
					  "targets": 9,
					  "render": function (data, type, row, meta) {
	                	   return '<button type="button" class="btn btn-primary btn-xs masterdata-delete" data-id=' + row['ID'] + ' > <i class="fa fa-trash"> </i> Delete</button>';           
	                   }
				  }
				  ];
var aoColumns_masterdata = [{ "mData": "stt","defaultContent":""},
				 { "mData": "id", "defaultContent":"" },
				 { "mData": "text", "defaultContent":"" },
				 { "mData": "textEn", "defaultContent":"" },
				 { "mData": "SORT", "defaultContent":"" },
				 { "mData": "ISACTIVE", "defaultContent":"" },
				 { "mData": "VALUE", "defaultContent":"" },
				 { "mData": "textparent", "defaultContent":"" },
				 { "mData": null},
				 { "mData": null}
				 ];


$(document).ready(function() {
	page_context =  $('#PageContext').val() ;
	
	var nameTable_masterdata = "xtable_masterdata";
	
	var flagData = false;
	
	$('input[type="checkbox"]').change(function(){
	    this.value = (Number(this.checked));
	});
	
	
	
	 $('#btnAddMasterData').click(function() {
		 if( $('#code').val()==="0")
		 {
			 alert("Please choose category before insert");
		 }
		 else
		 {
			 popupModalAdd($('#PageContext').val() + 'addMasterdata' + "/" + $('#code').val() );
		 }
		 	
	 });
	
	function loadTable(code){
		
			if(flagData)
			{
				$( "#" + nameTable_masterdata + "_wrapper" ).remove();
				initTable("div_masterdata",nameTable_masterdata);
			}
			
			

			var url = page_context + "masterdata/" + code   ;;
			$('#cusloading').show();
			var table = $('#' + nameTable_masterdata).DataTable({
						//dom: "Blfrtip",
						//buttons: btnjs,
						"sAjaxSource": url,
						"sAjaxDataProp": "",
						//"order": [[ 0, "asc" ]],
					    "scrollCollapse": true,
					   // "scrollY": "150px",
					    "paging":         false,
					    "autoWidth": true,
					    "ordering": false,
		                "scrollX":  true,
		                "searching": false,
		                "fnCreatedRow": function(row,data,index) {
		                    $('td',row).eq(0).html(index + 1);
		                },
		                "columnDefs": columnDefs_masterdata,
						"aoColumns": aoColumns_masterdata
				 });
				table.columns.adjust().draw();
			
				flagData=true;
				
				var url = page_context + 'editMasterdata/';
				initEventClickForEditOrDelete(nameTable_masterdata,".masterdata-edit",url);
				
				
				url = page_context + 'deleteMasterdata/';
				initEventClickForEditOrDelete(nameTable_masterdata,".masterdata-delete",url);
				$('#cusloading').hide();
	}
	
	$("#code").change(function() {
		console.log($("#code").val());
		
		//Load data
		var code = $( "#code").val(); 
		if( code !=="0" )
		{
			loadTable(code);
		}
		else
		{
			
		}

	});
	
	

	
	

});