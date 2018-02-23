module.exports = function(grunt) {

  require('load-grunt-tasks')(grunt);
  

  grunt.initConfig({
    compress: {
      main: {
        options: {
          archive: 'accsnode2.zip',
          pretty: true
        },
        expand: true,
        cwd: 'node-server/',
        src: ['**/*'],
        dest: './'
      }
    }
  });

  grunt.registerTask('default', ['compress']);
};
