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
    "filename": "./out/artifacts/COFCOService_war_exploded/WEB-INF/doc/main.js",
    "group": "I__Android_project_AppService03_COFCOService_out_artifacts_COFCOService_war_exploded_WEB_INF_doc_main_js",
    "groupTitle": "I__Android_project_AppService03_COFCOService_out_artifacts_COFCOService_war_exploded_WEB_INF_doc_main_js",
    "name": ""
  },
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
    "filename": "./web/WEB-INF/doc/main.js",
    "group": "I__Android_project_AppService03_COFCOService_web_WEB_INF_doc_main_js",
    "groupTitle": "I__Android_project_AppService03_COFCOService_web_WEB_INF_doc_main_js",
    "name": ""
  },
  {
    "type": "post",
    "url": "/main/getCreateInfo",
    "title": "获取创意信息详情",
    "version": "0.1.0",
    "name": "getCreateInfo",
    "group": "Main",
    "description": "<p>获取创意信息详情</p>",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "uid",
            "description": "<p>用户ID(必填)</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "creative_id",
            "description": "<p>创意ID(必填)</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "status",
            "defaultValue": "200",
            "description": ""
          }
        ]
      }
    },
    "filename": "./src/main/java/com/cofco/appservice/action/CreateListAction.java",
    "groupTitle": "Main",
    "sampleRequest": [
      {
        "url": "http://192.168.2.123:8080/main/getCreateInfo"
      }
    ]
  },
  {
    "type": "get",
    "url": "/main/getCreateList",
    "title": "获取创意列表",
    "version": "0.1.0",
    "name": "getCreateList",
    "group": "Main",
    "description": "<p>获取创意列表</p>",
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "status",
            "defaultValue": "200",
            "description": ""
          }
        ]
      },
      "examples": [
        {
          "title": "{",
          "content": "{\n    \"status\": 200,\n    \"data\": {\n        \"createLBeans\": [\n            {\n                \"id\": 1,\n                \"creative_id\": 1,\n                \"creative_name\": \"创意测试\",\n                \"creative_description\": \"测试测试\",\n                \"sort_id\": 1,\n                \"creative_type\": \"1\",\n                \"collect_num\": \"1\",\n                \"praise_num\": \"1\",\n                \"collect_id\": 1,\n                \"comment_num\": \"1\",\n                \"create_time\": \"20180718\",\n                \"photo\": [\n                    \"/image/1.jpg\",\n                    \"/image/2.jpg\",\n                    \"/image/3.jpeg\"\n                ],\n                \"vote_status\": 1,\n                \"collect_status\": true,\n                \"praise_status\": true,\n                \"comment_status\": true,\n                \"vote_num\": 1,\n                \"status\": 1\n            }\n        ]\n    },\n    \"msg\": \"获取创意列表数据成功！\"\n}",
          "type": "json"
        }
      ]
    },
    "filename": "./src/main/java/com/cofco/appservice/action/CreateListAction.java",
    "groupTitle": "Main",
    "sampleRequest": [
      {
        "url": "http://192.168.2.123:8080/main/getCreateList"
      }
    ]
  },
  {
    "type": "get",
    "url": "/image/getImages",
    "title": "获取图片列表",
    "version": "0.1.0",
    "name": "getImages",
    "group": "Main",
    "description": "<p>@apiExample</p>",
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "status",
            "defaultValue": "200.",
            "description": ""
          }
        ]
      }
    },
    "filename": "./src/main/java/com/cofco/appservice/action/ImageAction.java",
    "groupTitle": "Main",
    "sampleRequest": [
      {
        "url": "http://192.168.2.123:8080/image/getImages"
      }
    ]
  },
  {
    "type": "post",
    "url": "/mess/getMessageByuid",
    "title": "获取消息信息",
    "version": "0.1.0",
    "name": "getMessageByuid",
    "group": "Main",
    "description": "<p>@apiExample</p>",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "uid",
            "description": "<p>用户ID（必填）</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "status",
            "defaultValue": "200",
            "description": ""
          }
        ]
      },
      "examples": [
        {
          "title": "{",
          "content": "{\n    \"status\": 200,\n    \"data\": {\n        \"messageBeans\": [\n            {\n                \"id\": 1,\n                \"to_uid\": \"001\",\n                \"title\": \"哈哈\",\n                \"content\": \"哈哈哈哈\",\n                \"mktime\": \"\",\n                \"status_type\": \"1\"\n            }\n        ]\n    },\n    \"msg\": \"获取消息成功！\"\n}",
          "type": "json"
        }
      ]
    },
    "filename": "./src/main/java/com/cofco/appservice/action/MessageAction.java",
    "groupTitle": "Main",
    "sampleRequest": [
      {
        "url": "http://192.168.2.123:8080/mess/getMessageByuid"
      }
    ]
  },
  {
    "type": "post",
    "url": "/user/loginbypwd.do",
    "title": "用户登陆",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "username",
            "description": "<p>用户名（必填）</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "usercode",
            "description": "<p>用户密码（必填）</p>"
          }
        ]
      }
    },
    "group": "User",
    "success": {
      "examples": [
        {
          "title": "{",
          "content": "{\n    \"status\": 200,\n    \"data\": {\n        \"username\": \"admin\",\n        \"uid\": \"1\",\n        \"user_code\": \"123456\",\n        \"photo\": null,\n        \"creative_num\": null,\n        \"credit_num\": null,\n        \"token\": null\n    },\n    \"msg\": \"登录成功\"\n}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/cofco/appservice/action/UserAction.java",
    "groupTitle": "User",
    "name": "PostUserLoginbypwdDo",
    "sampleRequest": [
      {
        "url": "http://192.168.2.123:8080/user/loginbypwd.do"
      }
    ]
  }
] });
