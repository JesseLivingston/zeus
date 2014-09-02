require.config({
    //baseUrl: "http://cdn.staticfile.org",
    baseUrl: "resources/js",
    paths: {
        jquery: "jquery/2.1.1-rc2/jquery",
        domReady: "require-domReady/2.0.1/domReady",
        underscore: "underscore.js/1.6.0/underscore",
        backbone: "backbone/1.1.2/backbone",
        bootstrap: "twitter-bootstrap/3.2.0/js/bootstrap",
    },

    shim: {
        underscore: {
            exports: "_"
        },

        backbone: {
            exports: "Backbone",
            deps: [
                "jquery", "underscore"
            ]
        },

        //'bootstrap/bootstrap-slider': { deps: ['jquery'], exports: '$.fn.slider' },
        //'bootstrap/bootstrap-affix': { deps: ['jquery'], exports: '$.fn.affix' },
        'twitter-bootstrap/3.2.0/js/alert': { deps: ['jquery'], exports: '$.fn.alert' },
        'twitter-bootstrap/3.2.0/js/button': { deps: ['jquery'], exports: '$.fn.button' },
        'twitter-bootstrap/3.2.0/js/carousel': { deps: ['jquery'], exports: '$.fn.carousel' },
        'twitter-bootstrap/3.2.0/js/collapse': { deps: ['jquery'], exports: '$.fn.collapse' },
        'twitter-bootstrap/3.2.0/js/dropdown': { deps: ['jquery'], exports: '$.fn.dropdown' },
        'twitter-bootstrap/3.2.0/js/modal': { deps: ['jquery'], exports: '$.fn.modal' },
        'twitter-bootstrap/3.2.0/js/popover': { deps: ['jquery'], exports: '$.fn.popover' },
        'twitter-bootstrap/3.2.0/js/scrollspy': { deps: ['jquery'], exports: '$.fn.scrollspy'        },
        'twitter-bootstrap/3.2.0/js/tab': { deps: ['jquery'], exports: '$.fn.tab' },
        'twitter-bootstrap/3.2.0/js/tooltip': { deps: ['jquery'], exports: '$.fn.tooltip' },
        'twitter-bootstrap/3.2.0/js/transition': { deps: ['jquery'], exports: '$.support.transition' },
        //'twitter-bootstrap/3.2.0/bootstrap-typeahead': { deps: ['jquery'], exports: '$.fn.typeahead'  },
    }
});

require(["domReady", "jquery", "underscore", "backbone"], function(doc, $, _, Backbone){

    var Topic = Backbone.Model.extend({
        url: "topic/update"
    });

    var TopicList = Backbone.Collection.extend({
        model: Topic,
        url: "topics"
    });

    var Show = Backbone.Model.extend({
        url: "show/update"
    });

    var ShowList = Backbone.Collection.extend({
        model: Show,
        url: "shows"
    });

    var Spider = Backbone.Model.extend({
        url: "show/update"
    });

    var SpiderList = Backbone.Collection.extend({
        model: Spider,
        url: "spiders",

    });


    var Zeus = Backbone.Router.extend({

        routes: {
            "topics" : "topics",
            "spiders": "spiders",
            "shows"  : "shows"
        },

        topics: function(action){
            console.log("fetch topics." + action);
            new TopicList().fetch({
                success: function(){
                    console.log("fetch success");
                },
                error: function(){
                    console.log("fetch failure")
                }
            });
        },

        "spiders": function(){
            console.log("fetch spiders.")
            new SpiderList().fetch({
                success: function(){
                    console.log("fetch success");
                },
                error: function(){
                    console.log("fetch failure")
                }
            });
        },

        "shows": function(){
            console.log("fetch shows.")
            new ShowList().fetch({
                success: function(){
                    console.log("fetch success");
                },
                error: function(){
                    console.log("fetch failure")
                }
            });
        }
    });

    var zeus = new Zeus();


    Backbone.history.start({trigger: true});


});
