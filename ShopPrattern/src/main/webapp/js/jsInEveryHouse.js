

// ------------------------------- CATEGORY!!!!!!-----------------------------------------
//========================================================================================

 function saveCategory() {
	

        var category = {

            name: document.getElementById('nameCategory').value

        }

        document.getElementById('nameCategory').value = '';

        $.ajax({


            url: 'saveCategory?' + $('input[name=csrf_name]').val() + "=" + $('input[name=csrf_value]').val(),
            method: 'POST',
            contentType: 'application/json; charset=UTF-8',
            dataType: 'json',
            data: JSON.stringify(category),
            success: function (res) { 
            	
    	
                var all = '';

                for (var i = 0; i < res.length; i++) {
                    var index = res[i].id;
                    all += '<div class="box">'+res[i].name +'<a onclick="deleteCategory(' + index + ')"> delete </div><br>';
                }
                document.getElementById('allCategories').innerHTML = all;
            }
            

        })
    

}

window.onload = function () {

    $.ajax({

        url: 'loadCategories?' + $('input[name=csrf_name]').val() + "=" + $('input[name=csrf_value]').val(),
        method: 'POST',
        contentType: 'application/json; charset=UTF-8',
        dataType: 'json',
        success: function (res) {

            var all = '';

            for (var i = 0; i < res.length; i++) {
                var index = res[i].id;
                all += '<div class="box">'+res[i].name +'<a onclick="deleteCategory(' + index + ')"> delete </div><br>';
            }
            document.getElementById('allCategories').innerHTML = all;
        }
    })

}

function deleteCategory(index) {

    $.ajax({

        url: 'deleteCategory?' + $('input[name=csrf_name]').val() + "=" + $('input[name=csrf_value]').val(),
        method: 'POST',
        contentType: 'application/json; charset=UTF-8',
        dataType: 'json',
        data: '' + index,
        success: function (res) {

            var all = '';

            for (var i = 0; i < res.length; i++) {
                var index = res[i].id;
                all += '<div class="box">'+res[i].name +'<a onclick="deleteCategory(' + index + ')"> delete </div><br>';
            }
            document.getElementById('allCategories').innerHTML = all;
        	
        }
    })


}

//------------------------------------CATEGORY END!--------------------------------------------
//=============================================================================================




//-----------------------------------START NEW ERA!!!------------------------------------------
//=============================================================================================
//------------------------------------CATALOG--------------------------------------------------


function saveCatalog() {

    var catalog = {

        name : $('#nameCatalog').val(),

//        category : {
//
//            id : document.getElementById('idCategory').value
//
//        }

    }

    document.getElementById('nameCatalog').value = '';

    $.ajax({

        url: 'saveCatalog?' + $('input[name=csrf_name]').val() + "=" + $('input[name=csrf_value]').val(),
        method: 'POST',
        contentType: 'application/json; charset=UTF-8',
        dataType: 'json',
        data: JSON.stringify(catalog),
        success : function (res) {
        	
        	   var all = '';

               for (var i = 0; i < res.length; i++) {
                   var index = res[i].id;
                   all += '<div class="box">'+res[i].name +'<a onclick="deleteCatalog(' + index + ')"> delete </div><br>';
               }
               document.getElementById('allCatalogs').innerHTML = all;
        }
    })
}

window.onload = function () {

    $.ajax({

        url: 'loadCatalogs?' + $('input[name=csrf_name]').val() + "=" + $('input[name=csrf_value]').val(),
        method: 'POST',
        contentType: 'application/json; charset=UTF-8',
        dataType: 'json',
        success: function (res) {

            var all = '';

            for (var i = 0; i < res.length; i++) {
                var index = res[i].id;
                all += '<div class="box">'+res[i].name +'<a onclick="deleteCatalog(' + index + ')"> delete </div><br>';
            }
            document.getElementById('allCatalogs').innerHTML = all;
        }
    })

}

function deleteCatalog(index) {

    $.ajax({

        url: 'deleteCatalog?' + $('input[name=csrf_name]').val() + "=" + $('input[name=csrf_value]').val(),
        method: 'POST',
        contentType: 'application/json; charset=UTF-8',
        dataType: 'json',
        data: '' + index,
        success: function (res) {

            var all = '';

            for (var i = 0; i < res.length; i++) {
                var index = res[i].id;
                all += '<div class="box">'+res[i].name +'<a onclick="deleteCatalog(' + index + ')"> delete </div><br>';
            }
            document.getElementById('allCatalogs').innerHTML = all;
        	
        }
    })
}
