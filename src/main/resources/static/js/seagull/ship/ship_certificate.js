var page_context;
function uploadCertificate() {
	console.log("uploadCertificate");
	var m = new FormData($("#upload-certificate-form")[0]);
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


var columnDefs_certificate_ship = [{"title": "STT","targets": 0},
				  { 
					"targets": 1,
					"visible": false,
	                "searchable": false
				  },
				  {"title": "Tên","targets": 2,"width":"25%",
					  "mRender" : function ( datas, type, full ) { 
						  
					        return full['tenchungchitau'] + '<br>' + (full['tenchungchitauEn']==null? '':full['tenchungchitauEn']) ;
					      }
				  },
		
				  {
					  "title": "Ngày cấp",
					  "targets": 3,
		                "render": function (data) {
		                
		                	if(isNaN(data))
		                	{
		                		return '';
		                	}
		                	else
		                		return formatDate(data);
		                }
				  },
				  {
					  "title": "Ngày hết hạn",
					  "targets": 4,
		                "render": function (data) {
		                	if(isNaN(data))
		                	{
		                		return '';
		                	}
		                	else
		                		return formatDate(data);
		                }
				  },
				  {"title": "Last Annual","targets": 5, "render": function (data) {
	                	if(isNaN(data))
	                	{
	                		return '';
	                	}
	                	else
	                		return formatDate(data);
	                }},
				  {"title": "Next Endorsement","targets": 6,"render": function (data) {
	                	if(isNaN(data))
	                	{
	                		return '';
	                	}
	                	else
	                		return formatDate(data);
	                }},
				  {"title": "Hình scan","targets": 7,
					  "mRender" : function ( data, type, full ) { 
						  
						 
						  return (full['hscanName']==null ? '':"<a style='text-decoration: underline;color:blue' id='hinhScanLink' href='" + $('#PageContext').val() + 'disk/' + full['hinhscan'] + "' target='_blank' title='Download hình scan' >" + full['hscanName']  + "</a>") ;
					     
					  }
				  
				  },
				  {"title": "Ghi chú","targets": 8},
				  {
					  "title": "",
					  "targets": 9,
	                  
	                  "render": function (data, type, row, meta) {
	                	   return '<button type="button" class="btn btn-primary btn-xs ship-certificate-edit" data-id=' + row['id'] + ' > <i class="fa fa-edit"> </i> Edit</button>';           
	                   }
	         
				  },
				  {
					  "title": "",
					  "targets": 10,
					  "render": function (data, type, row, meta) {
	                	   return '<button type="button" class="btn btn-primary btn-xs ship-certificate-delete" data-id=' + row['id'] + ' > <i class="fa fa-trash"> </i> Delete</button>';           
	                   }
				  }
				  ];

var ao_certificate_ship = [{ "mData": "stt","defaultContent":""},
				 { "mData": "id", "defaultContent":"" },
			     { "mData": "tenchungchitau", "defaultContent":"" },
				 { "mData": "ngaycap", "defaultContent":"" },
				 { "mData": "ngayhethan", "defaultContent":"" }, 
				 { "mData": "lastannual", "defaultContent":"" },
				 { "mData": "nextendorsement", "defaultContent":"" },
				 { "mData": "hscanDownName", "defaultContent":"" },
				 { "mData": "ghichu", "defaultContent":"" },
				 { "mData": null},
				 { "mData": null}
				 ];

$(document).ready( function () {
	
	
	
//	$('a[data-toggle="tab"]').on( 'shown.bs.tab', function (e) {
//        $.fn.dataTable.tables( {visible: true, api: true} ).columns.adjust();
//    } );
//	
	
	page_context =  $('#PageContext').val() ;

	var url = $('#PageContext').val() + "get_certificates_ship/" + $('#ship_id').val()   ;
	var nameTable_certificate = "xtable_ship_certificate";
	
	
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
                "columnDefs": columnDefs_certificate_ship,
				"aoColumns": ao_certificate_ship
		 });
		table.columns.adjust().draw();
		
		
		var url = page_context + 'editShipCertificate/';
		initEventClickForEditOrDelete(nameTable_certificate,".ship-certificate-edit",url);
		
		
		url = page_context + 'deleteShipCertificate/';
		initEventClickForEditOrDelete(nameTable_certificate,".ship-certificate-delete",url);
		
	
	
		
});

