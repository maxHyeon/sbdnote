import React, { useEffect } from 'react'
import CssBaseline from '@material-ui/core/CssBaseline';
import Button from '@material-ui/core/Button'
import Container from '@material-ui/core/Container';
import TextField from '@material-ui/core/TextField';
import { makeStyles } from '@material-ui/core/styles';
import 'date-fns';
import DateFnsUtils from '@date-io/date-fns';
import {
  MuiPickersUtilsProvider,
  KeyboardDatePicker,
} from '@material-ui/pickers';

const useStyles = makeStyles(theme => ({
  root: {
    display: 'flex',
    flexWrap: 'wrap',
    '& .MuiTextField-root': {
      margin: theme.spacing(1),
     
    }, 
  },
  textField: {
    marginLeft: theme.spacing(1),
    marginRight: theme.spacing(1),
    width: 200,
  },
}));


export default function SimpleContainer() {
  const classes = useStyles();
  const [workOut, setWork] = React.useState({id:'',title:'',note:'',date:''})
  const [value, setValue] = React.useState('Controlled');

  const [selectedDate, setSelectedDate] = React.useState(new Date());
  useEffect (() =>{
    fetch(
      'http://localhost:3030/work/1',{
        method:'GET',
        headers: new Headers({
          Accept:'application/json'
        })
      }
    )
      .then(res=>res.json())
      .then(workOut =>{setWork(workOut)})
  },[]);
  const handleDateChange = date => {
    setSelectedDate(date);
  };
  const handleChange = event => {
    setValue(event.target.value);
  };
  

  return (
    <React.Fragment>
      <CssBaseline />
      <Container maxWidth="sm">
        <form className={classes.root} noValidate autoComplete="off">
            <TextField 
              required id="standard-required"  
              label="WorkOut" 
              placeholder="Placeholder" 
              value={workOut.title}
            />
            <MuiPickersUtilsProvider utils={DateFnsUtils}>
              <KeyboardDatePicker
                disableToolbar
                variant="inline"
                format="yyyy/MM/dd"
                margin="normal"
                id="date-picker-inline"
                label="Date"
                value={workOut.date.date}
                onChange={handleDateChange}
                KeyboardButtonProps={{
                  'aria-label': 'change date',
                }}
              />
            </MuiPickersUtilsProvider>
            <TextField
              id="standard-multiline-flexible"
              label="WorkOut"
              multiline
              rowsMax="20"
              rows="20"
              fullWidth
              value={workOut.note}
              onChange={handleChange}
            />
            <Button onClick={()=>{console.log('click')}}>
              SAVE
            </Button>
            {/* <TextField disabled id="standard-disabled" label="Disabled" defaultValue="Hello World" />
            <TextField
              id="standard-password-input"
              label="Password"
              type="password"
              autoComplete="current-password"
            />
            <TextField
              id="standard-read-only-input"
              label="Read Only"
              defaultValue="Hello World"
              InputProps={{
                readOnly: true,
              }}
            />
            <TextField
              id="standard-number"
              label="Number"
              type="number"
              InputLabelProps={{
                shrink: true,
              }}
            />
            <TextField id="standard-search" label="Search field" type="search" />
            <TextField
              id="standard-helperText"
              label="Helper text"
              defaultValue="Default Value"
              helperText="Some important text"
            /> */}
        </form>
      </Container>
    </React.Fragment>
  );
}