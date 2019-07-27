define({ "api": [
  {
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "optional": false,
            "field": "varname1",
            "description": "<p>No type.</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "varname2",
            "description": "<p>With type.</p>"
          }
        ]
      }
    },
    "type": "",
    "url": "",
    "version": "0.0.0",
    "filename": "./target/classes/static/apidoc/main.js",
    "group": "C__Users_Administrator_IdeaProjects_webflux_demo_target_classes_static_apidoc_main_js",
    "groupTitle": "C__Users_Administrator_IdeaProjects_webflux_demo_target_classes_static_apidoc_main_js",
    "name": ""
  },
  {
    "type": "POST",
    "url": "/hello",
    "title": "添加用户需求",
    "version": "1.0.0",
    "group": "NEED",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "need_name",
            "description": "<p>需求者名称-非空</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "e_mail",
            "description": "<p>用户邮箱-非空邮箱格式</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "phone",
            "description": "<p>用户电话-非空</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "company_name",
            "description": "<p>需求公司名称-非空</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "needs_desc",
            "description": "<p>需求描述-非空</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "code",
            "description": "<p>返回码</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "reason",
            "description": "<p>中文解释</p>"
          },
          {
            "group": "Success 200",
            "type": "String[]",
            "optional": false,
            "field": "data",
            "description": "<p>返回数据</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "HTTP/1.1 200 OK\n{\n     \"code\":0,\n     \"reason\":\"需求已经提交了，我们的工作人员会在2个工作日内和您取得联系!\",\n     \"data\":[]\n }",
          "type": "json"
        }
      ]
    },
    "filename": "./src/main/java/com/kevin/webfluxdemo/sys/controller/UserController.java",
    "groupTitle": "NEED",
    "name": "PostHello",
    "sampleRequest": [
      {
        "url": "http://localhost:8080/hello"
      }
    ]
  }
] });
