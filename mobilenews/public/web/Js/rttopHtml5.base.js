﻿var rttophtml5mobi = {
    author: 'tgrong',
    version: '1.0',
    website: 'http://localhost:9000'
}
rttophtml5mobi.utils = {
    setParam: function(name, value) {
        localStorage.setItem(name, value)
    },
    getParam: function(name) {
        return localStorage.getItem(name)
    }
}
