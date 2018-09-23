
function uploadCertificate() {
	
    $.ajax({
        url: page_context + 'uploadImage',
        type: "POST",
        data: new FormData($("#upload-certificate-form")[0]),
        enctype: 'multipart/form-data',
        
        processData: false,
        contentType: false,
        cache: false,
        success: function(data) {
        	
        	
         	if(data)
        	{
         		console.log("certificate id: " + data)
        		$('#hinhCertificate').val( data.id);
         		$("#linkCertificate").attr("href", page_context +'disk/' + data.name );		
         		
         		$("#linkCertificate").html(data.full_path);
        	}

        	
            // Handle upload success
            // ...
        },
        error: function() {
            // Handle upload error
            // ...
        }
    });
} // function uploadFile


var columnDefs_certificate = [{"title": "STT","targets": 0},
				  { 
					"targets": 1,
					"visible": false,
	                "searchable": false
				  },
				  {"title": "Tên","targets": 2,"width":"25%",
					  "mRender" : function ( data, type, full ) { 
						  
					        return full['tenchungchi'] + '<br>' + (full['tenchungchiEn']==null? '':full['tenchungchiEn']) ;
					      }
				  },
				  
				  {"title": "Số","targets": 3},
				  {
					  "title": "Ngày cấp",
					  "targets": 4,
		                "render": function (data) {
		                	if(isNaN(data))
		                	{
		                		return '';
		                	}
		                	else
		                	{
		                		var date = new Date(data);
		                		var month = date.getMonth() + 1;
		                		return date.getDate() +  "/" + (month > 9 ? month : "0" + month) + "/" + date.getFullYear();
		                	}
		                }
				  },
				  {
					  "title": "Ngày hết hạn",
					  "targets": 5,
		                "render": function (data) {
		                	if(isNaN(data))
		                	{
		                		return '';
		                	}
		                	else
		                	{
		                		var date = new Date(data);
		                		var month = date.getMonth() + 1;
		                		return date.getDate() +  "/" + (month > 9 ? month : "0" + month) + "/" + date.getFullYear();
		                	}
		                }
				  },
				  {"title": "Hình scan","targets": 6,
					  "mRender" : function ( data, type, full ) { 
						  
						 
						  return (full['hscanName']==null ? '':"<a style='text-decoration: underline;color:blue' id='hinhScanLink' href='" + $('#PageContext').val() + 'disk/' + full['hscanDownName'] + "' target='_blank' title='Download hình scan' >" + full['hscanName']  + "</a>") ;
					     
					  }
				  
				  },
				  {
					  "title": "",
					  "targets": 7,
	                  
	                  "render": function (data, type, row, meta) {
	                	   return '<button type="button" class="btn btn-primary btn-xs certificate-edit" data-id=' + row['id'] + ' > <i class="fa fa-edit"> </i> Edit</button>';           
	                   }
	         
				  },
				  {
					  "title": "",
					  "targets": 8,
					  "render": function (data, type, row, meta) {
	                	   return '<button type="button" class="btn btn-primary btn-xs certificate-delete" data-id=' + row['id'] + ' > <i class="fa fa-trash"> </i> Delete</button>';           
	                   }
				  }
				  ];

var aoColumns_certificate = [{ "mData": "stt","defaultContent":""},
				 { "mData": "id", "defaultContent":"" },
			     { "mData": "tenchungchi", "defaultContent":"" },
			  	 { "mData": "so", "defaultContent":"" },
				 { "mData": "tungay", "defaultContent":"" },
				 { "mData": "denngay", "defaultContent":"" },
				 { "mData": "hscanDownName", "defaultContent":"" },
				 { "mData": null},
				 { "mData": null}
				 ];

$(document).ready( function () {
	
	
	
	$('a[data-toggle="tab"]').on( 'shown.bs.tab', function (e) {
        $.fn.dataTable.tables( {visible: true, api: true} ).columns.adjust();
    } );
	
	
	var page_context =  $('#PageContext').val() ;
	var url = $('#PageContext').val() + "certificate/" + $('#thuyenvienId').val()   ;
    
	var nameTable_certificate = "xtable_certificate";
	
	var table = $('#' + nameTable_certificate).DataTable({
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
                "columnDefs": columnDefs_certificate,
				"aoColumns": aoColumns_certificate
		 });
		table.columns.adjust().draw();
		
		
		var url = page_context + 'editCertificate/';
		initEventClickForEditOrDelete(nameTable_certificate,".certificate-edit",url);
		
		
		url = page_context + 'deleteCertificate/';
		initEventClickForEditOrDelete(nameTable_certificate,".certificate-delete",url);
		
	
	
		
});

