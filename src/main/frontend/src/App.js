import React, {useState, useEffect, useCallback} from 'react';
import './App.css';
import axios from 'axios';
import {useDropzone} from 'react-dropzone'

const UserProfiles = () => {

  const [userProfiles, setUserProfiles] = useState([]);

  const fetchUserProfiles = () => {
    axios.get('http://localhost:8080/api/v1/user-profile').then(res => {
      console.log(res);
      setUserProfiles(res.data); 
    })
  }

  useEffect(() => {
    fetchUserProfiles();
  }, []);

  return userProfiles.map((UserProfile, index) => {
    return (
      <div key={index}>
        <br />
        <br />
        <h1>{UserProfile.username}</h1>
        <h2>{UserProfile.userProfileId}</h2>
        <br />
        <Dropzone />
      </div>
    )
  })
}

function Dropzone() {
  const onDrop = useCallback(acceptedFiles => {
    const file = acceptedFiles[0]
    console.log(file);
  }, [])
  const {getRootProps, getInputProps, isDragActive} = useDropzone({onDrop})

  return (
    <div {...getRootProps()}>
      <input {...getInputProps()} />
      {
        isDragActive ?
          <p>Drop the files here ...</p> :
          <p>Drag 'n' drop some files here, or click to select files</p>
      }
    </div>
  )
}

function App() {
  return (
    <div className="App">
      <UserProfiles />
    </div>
  );
}

export default App;
