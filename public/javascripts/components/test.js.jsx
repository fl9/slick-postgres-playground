var Test = React.createClass({
  render: function() {
    return (
      <div>
        Hallo
      </div>
    )
  }
});

React.render(
  <Test />,
  document.getElementById('test')
)