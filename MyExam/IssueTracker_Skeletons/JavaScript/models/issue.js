const Sequelize = require('sequelize');

module.exports = function (sequelize) {
    let Issue = sequelize.define("Issue", {
        title: {
            type: Sequelize.STRING,
            allowNull: false,
        },
        content: {
            type: Sequelize.STRING,
            allowNull: false,
        },
        priority: {
            type: Sequelize.INTEGER,
            allowNull: false,
        }
    },{
        timestamps:false
    });
    return Issue;

};