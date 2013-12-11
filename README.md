grails-plugin-datatablejson
===========================

Automagically generate JSON data for DataTable plugin (http://datatables.net/)

Version 0.1 - Powered by [Nafiux](http://www.nafiux.com)

(Pending for approbation)

## Features

* Return JSON data in DataTable format to render your table
* Support filtering and ordering
* Customize format for each field 

## Installation

Add `compile ":data-table-json:0.1"` to **BuildConfig.groovy** in plugins section (requires grails 2.0 > *).

## Usage

### Simple

In your controller:

1) Inject service dependence

    def dataTableJsonService

2) In your controller method, call to `process` service function

    def listAjax() {
      def where = ""
      def fieldFormat = []
      render dataTableJsonService.process(params, Foo, where, fieldFormat)
      // params contains all fields from datatable request
      // Foo is the name of your domain class you want get data
      return
    }

3) In your view

    $('#table1').dataTable({
      bJQueryUI: true,
      bRetrieve: true,
      bDestroy: true,
      bServerSide: true,
      sScrollY: '345px',
      bScrollCollapse: true,
      sServerMethod: 'POST',
      bProcessing: true,
      sAjaxSource: '/yourApp/yourController/listAjax',
      sPaginationType: "full_numbers",
      aoColumns: [
        {mDataProp: 'id', sClass: 'center', bSortable: true, bSearchable:false},
        {mDataProp: 'name', bSortable: true, bSearchable:true},
        {mDataProp: 'bar.name', bSortable: true, bSearchable:true},
      ],
      fnFooterCallback: conf.fnFooterCallback
    });
